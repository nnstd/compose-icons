package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PuzzleEditOutline: ImageVector
    get() {
        if (_PuzzleEditOutline != null) {
            return _PuzzleEditOutline!!
        }
        _PuzzleEditOutline = ImageVector.Builder(
            name = "PuzzleEditOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.04f, 12.13f)
                curveTo(20.9f, 12.13f, 20.76f, 12.19f, 20.65f, 12.3f)
                lineTo(19.65f, 13.3f)
                lineTo(21.7f, 15.35f)
                lineTo(22.7f, 14.35f)
                curveTo(22.92f, 14.14f, 22.92f, 13.79f, 22.7f, 13.58f)
                lineTo(21.42f, 12.3f)
                curveTo(21.31f, 12.19f, 21.18f, 12.13f, 21.04f, 12.13f)
                moveTo(19.07f, 13.88f)
                lineTo(13f, 19.94f)
                verticalLineTo(22f)
                horizontalLineTo(15.06f)
                lineTo(21.12f, 15.93f)
                lineTo(19.07f, 13.88f)
                moveTo(11.05f, 19.06f)
                curveTo(10.87f, 19f, 10.69f, 19f, 10.5f, 19f)
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
                curveTo(19.36f, 10.09f, 19.69f, 10.21f, 20f, 10.36f)
                curveTo(19.73f, 10.5f, 19.46f, 10.66f, 19.24f, 10.89f)
                lineTo(18.12f, 12f)
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
                curveTo(11.26f, 17f, 12f, 17.18f, 12.61f, 17.5f)
                lineTo(11.05f, 19.06f)
                close()
            }
        }.build()

        return _PuzzleEditOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PuzzleEditOutline: ImageVector? = null
