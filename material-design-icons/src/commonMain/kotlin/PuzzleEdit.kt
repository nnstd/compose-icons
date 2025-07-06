package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PuzzleEdit: ImageVector
    get() {
        if (_PuzzleEdit != null) {
            return _PuzzleEdit!!
        }
        _PuzzleEdit = ImageVector.Builder(
            name = "PuzzleEdit",
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
                moveTo(19f, 11.12f)
                lineTo(11.91f, 18.2f)
                curveTo(11.5f, 17.95f, 11f, 17.8f, 10.5f, 17.8f)
                curveTo(9f, 17.8f, 7.8f, 19f, 7.8f, 20.5f)
                verticalLineTo(22f)
                horizontalLineTo(4f)
                curveTo(2.9f, 22f, 2f, 21.11f, 2f, 20f)
                verticalLineTo(16.2f)
                horizontalLineTo(3.5f)
                curveTo(5f, 16.2f, 6.2f, 15f, 6.2f, 13.5f)
                reflectiveCurveTo(5f, 10.8f, 3.5f, 10.8f)
                horizontalLineTo(2f)
                verticalLineTo(7f)
                curveTo(2f, 5.9f, 2.9f, 5f, 4f, 5f)
                horizontalLineTo(8f)
                verticalLineTo(3.5f)
                curveTo(8f, 2.12f, 9.12f, 1f, 10.5f, 1f)
                reflectiveCurveTo(13f, 2.12f, 13f, 3.5f)
                verticalLineTo(5f)
                horizontalLineTo(17f)
                curveTo(18.1f, 5f, 19f, 5.89f, 19f, 7f)
                verticalLineTo(11.12f)
                close()
            }
        }.build()

        return _PuzzleEdit!!
    }

@Suppress("ObjectPropertyName")
private var _PuzzleEdit: ImageVector? = null
