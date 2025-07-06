package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Smoke: ImageVector
    get() {
        if (_Smoke != null) {
            return _Smoke!!
        }
        _Smoke = ImageVector.Builder(
            name = "Smoke",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 19f)
                verticalLineTo(22f)
                horizontalLineTo(15f)
                verticalLineTo(19f)
                curveTo(15f, 17.9f, 14.1f, 17f, 13f, 17f)
                horizontalLineTo(10f)
                curveTo(7.2f, 17f, 5f, 14.8f, 5f, 12f)
                curveTo(5f, 10.8f, 5.4f, 9.8f, 6.1f, 8.9f)
                curveTo(3.8f, 8.5f, 2f, 6.4f, 2f, 4f)
                curveTo(2f, 3.3f, 2.2f, 2.6f, 2.4f, 2f)
                horizontalLineTo(4.8f)
                curveTo(4.3f, 2.5f, 4f, 3.2f, 4f, 4f)
                curveTo(4f, 5.7f, 5.3f, 7f, 7f, 7f)
                horizontalLineTo(10f)
                verticalLineTo(9f)
                curveTo(8.3f, 9f, 7f, 10.3f, 7f, 12f)
                reflectiveCurveTo(8.3f, 15f, 10f, 15f)
                horizontalLineTo(13f)
                curveTo(15.2f, 15f, 17f, 16.8f, 17f, 19f)
                moveTo(17.9f, 8.9f)
                curveTo(20.2f, 8.5f, 22f, 6.4f, 22f, 4f)
                curveTo(22f, 3.3f, 21.8f, 2.6f, 21.6f, 2f)
                horizontalLineTo(19.2f)
                curveTo(19.7f, 2.5f, 20f, 3.2f, 20f, 4f)
                curveTo(20f, 5.7f, 18.7f, 7f, 17f, 7f)
                horizontalLineTo(15.8f)
                curveTo(15.9f, 7.3f, 16f, 7.6f, 16f, 8f)
                curveTo(16f, 9.7f, 14.7f, 11f, 13f, 11f)
                verticalLineTo(13f)
                curveTo(15.8f, 13f, 18f, 15.2f, 18f, 18f)
                verticalLineTo(22f)
                horizontalLineTo(20f)
                verticalLineTo(18f)
                curveTo(20f, 15.3f, 18.5f, 13f, 16.2f, 11.8f)
                curveTo(17.1f, 11.1f, 17.7f, 10.1f, 17.9f, 8.9f)
                close()
            }
        }.build()

        return _Smoke!!
    }

@Suppress("ObjectPropertyName")
private var _Smoke: ImageVector? = null
