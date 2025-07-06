package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Pasta: ImageVector
    get() {
        if (_Pasta != null) {
            return _Pasta!!
        }
        _Pasta = ImageVector.Builder(
            name = "Pasta",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 16.5f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                horizontalLineTo(9f)
                curveTo(9.5f, 3.03f, 9.95f, 3.24f, 10.34f, 3.63f)
                reflectiveCurveTo(10.95f, 4.5f, 11f, 5f)
                horizontalLineTo(21f)
                verticalLineTo(6f)
                horizontalLineTo(11f)
                curveTo(10.95f, 6.53f, 10.73f, 7f, 10.34f, 7.43f)
                reflectiveCurveTo(9.5f, 8.05f, 9f, 8f)
                horizontalLineTo(7f)
                verticalLineTo(15.05f)
                curveTo(7.05f, 15.05f, 7.13f, 15.04f, 7.24f, 15f)
                reflectiveCurveTo(7.44f, 15f, 7.5f, 15f)
                curveTo(8.06f, 15f, 8.7f, 15.14f, 9.42f, 15.42f)
                curveTo(9.83f, 14.5f, 10.53f, 13.68f, 11.53f, 13f)
                reflectiveCurveTo(13.53f, 12f, 14.53f, 12f)
                curveTo(16.06f, 12f, 17.36f, 12.53f, 18.42f, 13.59f)
                reflectiveCurveTo(20f, 15.95f, 20f, 17.5f)
                curveTo(20f, 17.55f, 20f, 17.64f, 20f, 17.77f)
                reflectiveCurveTo(19.97f, 17.97f, 19.97f, 18f)
                horizontalLineTo(3.14f)
                curveTo(3.27f, 17.5f, 3.55f, 17f, 4f, 16.5f)
                moveTo(6f, 15.23f)
                verticalLineTo(8f)
                horizontalLineTo(5f)
                verticalLineTo(15.7f)
                curveTo(5.5f, 15.45f, 5.81f, 15.3f, 6f, 15.23f)
                moveTo(9f, 7f)
                verticalLineTo(6f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                horizontalLineTo(9f)
                moveTo(9f, 4f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                horizontalLineTo(9f)
                verticalLineTo(4f)
                moveTo(5f, 4f)
                verticalLineTo(5f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                horizontalLineTo(5f)
                moveTo(5f, 6f)
                verticalLineTo(7f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                horizontalLineTo(5f)
                moveTo(2f, 19f)
                horizontalLineTo(22f)
                lineTo(20f, 21f)
                horizontalLineTo(4f)
                lineTo(2f, 19f)
                close()
            }
        }.build()

        return _Pasta!!
    }

@Suppress("ObjectPropertyName")
private var _Pasta: ImageVector? = null
