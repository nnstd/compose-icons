package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EiffelTower: ImageVector
    get() {
        if (_EiffelTower != null) {
            return _EiffelTower!!
        }
        _EiffelTower = ImageVector.Builder(
            name = "EiffelTower",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.21f, 17f)
                curveTo(8.65f, 16.15f, 9.06f, 15.16f, 9.44f, 14f)
                horizontalLineTo(9f)
                verticalLineTo(12f)
                horizontalLineTo(10f)
                curveTo(10.61f, 9.4f, 11f, 6.13f, 11f, 2f)
                horizontalLineTo(13f)
                curveTo(13f, 6.13f, 13.4f, 9.4f, 14f, 12f)
                horizontalLineTo(15f)
                verticalLineTo(14f)
                horizontalLineTo(14.56f)
                curveTo(14.94f, 15.16f, 15.35f, 16.15f, 15.79f, 17f)
                horizontalLineTo(17f)
                lineTo(17f, 19f)
                lineTo(19f, 22f)
                horizontalLineTo(16.58f)
                curveTo(15.81f, 20.24f, 14.05f, 19f, 12f, 19f)
                curveTo(9.95f, 19f, 8.19f, 20.24f, 7.42f, 22f)
                horizontalLineTo(5f)
                lineTo(7f, 19f)
                lineTo(6.97f, 17f)
                horizontalLineTo(8.21f)
                moveTo(12.59f, 14f)
                horizontalLineTo(11.41f)
                curveTo(11.07f, 15.13f, 10.69f, 16.13f, 10.28f, 17f)
                horizontalLineTo(13.72f)
                curveTo(13.32f, 16.13f, 12.93f, 15.13f, 12.59f, 14f)
                close()
            }
        }.build()

        return _EiffelTower!!
    }

@Suppress("ObjectPropertyName")
private var _EiffelTower: ImageVector? = null
