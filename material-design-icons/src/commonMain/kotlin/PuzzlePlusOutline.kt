package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PuzzlePlusOutline: ImageVector
    get() {
        if (_PuzzlePlusOutline != null) {
            return _PuzzlePlusOutline!!
        }
        _PuzzlePlusOutline = ImageVector.Builder(
            name = "PuzzlePlusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.2f, 22f)
                verticalLineTo(21.7f)
                curveTo(13.2f, 20.21f, 12f, 19f, 10.5f, 19f)
                curveTo(9f, 19f, 7.8f, 20.21f, 7.8f, 21.7f)
                verticalLineTo(22f)
                horizontalLineTo(4f)
                curveTo(2.9f, 22f, 2f, 21.11f, 2f, 20f)
                verticalLineTo(16.2f)
                horizontalLineTo(2.3f)
                curveTo(3.79f, 16.2f, 5f, 15f, 5f, 13.5f)
                reflectiveCurveTo(3.79f, 10.8f, 2.3f, 10.8f)
                horizontalLineTo(2f)
                verticalLineTo(7f)
                curveTo(2f, 5.9f, 2.9f, 5f, 4f, 5f)
                horizontalLineTo(7.04f)
                curveTo(7.28f, 3.3f, 8.74f, 2f, 10.5f, 2f)
                reflectiveCurveTo(13.72f, 3.3f, 13.96f, 5f)
                horizontalLineTo(17f)
                curveTo(18.11f, 5f, 19f, 5.9f, 19f, 7f)
                verticalLineTo(10.04f)
                curveTo(20.7f, 10.28f, 22f, 11.74f, 22f, 13.5f)
                curveTo(22f, 13.6f, 22f, 13.7f, 21.97f, 13.79f)
                curveTo(21.35f, 13.44f, 20.67f, 13.2f, 19.93f, 13.08f)
                curveTo(19.75f, 12.46f, 19.18f, 12f, 18.5f, 12f)
                horizontalLineTo(17f)
                verticalLineTo(7f)
                horizontalLineTo(12f)
                verticalLineTo(5.5f)
                curveTo(12f, 4.67f, 11.33f, 4f, 10.5f, 4f)
                reflectiveCurveTo(9f, 4.67f, 9f, 5.5f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                verticalLineTo(9.12f)
                curveTo(5.76f, 9.8f, 7f, 11.5f, 7f, 13.5f)
                reflectiveCurveTo(5.75f, 17.2f, 4f, 17.88f)
                verticalLineTo(20f)
                horizontalLineTo(6.12f)
                curveTo(6.8f, 18.25f, 8.5f, 17f, 10.5f, 17f)
                curveTo(11.47f, 17f, 12.37f, 17.3f, 13.12f, 17.81f)
                curveTo(13.04f, 18.19f, 13f, 18.59f, 13f, 19f)
                curveTo(13f, 20.1f, 13.3f, 21.12f, 13.81f, 22f)
                horizontalLineTo(13.2f)
                moveTo(18f, 15f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                verticalLineTo(23f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                horizontalLineTo(23f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _PuzzlePlusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PuzzlePlusOutline: ImageVector? = null
