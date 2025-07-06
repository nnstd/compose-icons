package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PuzzleCheckOutline: ImageVector
    get() {
        if (_PuzzleCheckOutline != null) {
            return _PuzzleCheckOutline!!
        }
        _PuzzleCheckOutline = ImageVector.Builder(
            name = "PuzzleCheckOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.5f, 17f)
                lineTo(18.5f, 22f)
                lineTo(15f, 18.5f)
                lineTo(16.5f, 17f)
                lineTo(18.5f, 19f)
                lineTo(22f, 15.5f)
                lineTo(23.5f, 17f)
                moveTo(22f, 13.5f)
                lineTo(22f, 13.8f)
                curveTo(21.37f, 13.44f, 20.67f, 13.19f, 19.94f, 13.07f)
                curveTo(19.75f, 12.45f, 19.18f, 12f, 18.5f, 12f)
                horizontalLineTo(17f)
                verticalLineTo(7f)
                horizontalLineTo(12f)
                verticalLineTo(5.5f)
                curveTo(12f, 4.67f, 11.33f, 4f, 10.5f, 4f)
                curveTo(9.67f, 4f, 9f, 4.67f, 9f, 5.5f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                lineTo(4f, 9.12f)
                curveTo(5.76f, 9.8f, 7f, 11.5f, 7f, 13.5f)
                curveTo(7f, 15.5f, 5.75f, 17.2f, 4f, 17.88f)
                verticalLineTo(20f)
                horizontalLineTo(6.12f)
                curveTo(6.8f, 18.25f, 8.5f, 17f, 10.5f, 17f)
                curveTo(11.47f, 17f, 12.37f, 17.3f, 13.12f, 17.8f)
                lineTo(13f, 19f)
                curveTo(13f, 20.09f, 13.29f, 21.12f, 13.8f, 22f)
                horizontalLineTo(13.2f)
                verticalLineTo(21.7f)
                curveTo(13.2f, 20.21f, 12f, 19f, 10.5f, 19f)
                curveTo(9f, 19f, 7.8f, 20.21f, 7.8f, 21.7f)
                verticalLineTo(22f)
                horizontalLineTo(4f)
                curveTo(2.9f, 22f, 2f, 21.1f, 2f, 20f)
                verticalLineTo(16.2f)
                horizontalLineTo(2.3f)
                curveTo(3.79f, 16.2f, 5f, 15f, 5f, 13.5f)
                curveTo(5f, 12f, 3.79f, 10.8f, 2.3f, 10.8f)
                horizontalLineTo(2f)
                verticalLineTo(7f)
                curveTo(2f, 5.9f, 2.9f, 5f, 4f, 5f)
                horizontalLineTo(7.04f)
                curveTo(7.28f, 3.3f, 8.74f, 2f, 10.5f, 2f)
                curveTo(12.26f, 2f, 13.72f, 3.3f, 13.96f, 5f)
                horizontalLineTo(17f)
                curveTo(18.1f, 5f, 19f, 5.9f, 19f, 7f)
                verticalLineTo(10.04f)
                curveTo(20.7f, 10.28f, 22f, 11.74f, 22f, 13.5f)
                close()
            }
        }.build()

        return _PuzzleCheckOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PuzzleCheckOutline: ImageVector? = null
