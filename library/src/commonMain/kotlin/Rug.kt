package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Rug: ImageVector
    get() {
        if (_Rug != null) {
            return _Rug!!
        }
        _Rug = ImageVector.Builder(
            name = "Rug",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 14f)
                curveTo(10.9f, 14f, 10f, 13.11f, 10f, 12f)
                reflectiveCurveTo(10.9f, 10f, 12f, 10f)
                reflectiveCurveTo(14f, 10.9f, 14f, 12f)
                reflectiveCurveTo(13.11f, 14f, 12f, 14f)
                moveTo(23f, 19f)
                horizontalLineTo(1f)
                verticalLineTo(17f)
                horizontalLineTo(4f)
                verticalLineTo(15f)
                horizontalLineTo(1f)
                verticalLineTo(13f)
                horizontalLineTo(4f)
                verticalLineTo(11f)
                horizontalLineTo(1f)
                verticalLineTo(9f)
                horizontalLineTo(4f)
                verticalLineTo(7f)
                horizontalLineTo(1f)
                verticalLineTo(5f)
                horizontalLineTo(23f)
                verticalLineTo(7f)
                horizontalLineTo(20f)
                verticalLineTo(9f)
                horizontalLineTo(23f)
                verticalLineTo(11f)
                horizontalLineTo(20f)
                verticalLineTo(13f)
                horizontalLineTo(23f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(17f)
                horizontalLineTo(23f)
                verticalLineTo(19f)
                moveTo(12f, 15.92f)
                curveTo(12.62f, 16.62f, 13.66f, 16.81f, 14.5f, 16.33f)
                curveTo(15.34f, 15.85f, 15.69f, 14.84f, 15.4f, 13.96f)
                curveTo(16.31f, 13.78f, 17f, 12.97f, 17f, 12f)
                reflectiveCurveTo(16.31f, 10.22f, 15.4f, 10.04f)
                curveTo(15.69f, 9.16f, 15.34f, 8.15f, 14.5f, 7.67f)
                curveTo(13.66f, 7.19f, 12.62f, 7.38f, 12f, 8.08f)
                curveTo(11.38f, 7.38f, 10.34f, 7.19f, 9.5f, 7.67f)
                curveTo(8.66f, 8.15f, 8.31f, 9.16f, 8.61f, 10.04f)
                curveTo(7.69f, 10.22f, 7f, 11.03f, 7f, 12f)
                reflectiveCurveTo(7.69f, 13.78f, 8.61f, 13.96f)
                curveTo(8.31f, 14.84f, 8.66f, 15.85f, 9.5f, 16.33f)
                curveTo(10.34f, 16.82f, 11.38f, 16.62f, 12f, 15.92f)
                close()
            }
        }.build()

        return _Rug!!
    }

@Suppress("ObjectPropertyName")
private var _Rug: ImageVector? = null
