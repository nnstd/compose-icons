package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Radioactive: ImageVector
    get() {
        if (_Radioactive != null) {
            return _Radioactive!!
        }
        _Radioactive = ImageVector.Builder(
            name = "Radioactive",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 11f)
                curveTo(14f, 12.1f, 13.1f, 13f, 12f, 13f)
                reflectiveCurveTo(10f, 12.1f, 10f, 11f)
                reflectiveCurveTo(10.9f, 9f, 12f, 9f)
                reflectiveCurveTo(14f, 9.9f, 14f, 11f)
                moveTo(16f, 11f)
                horizontalLineTo(22f)
                curveTo(22f, 7.3f, 20f, 4.1f, 17f, 2.3f)
                lineTo(14f, 7.5f)
                curveTo(15.2f, 8.2f, 16f, 9.5f, 16f, 11f)
                moveTo(12f, 15f)
                curveTo(11.3f, 15f, 10.6f, 14.8f, 10f, 14.4f)
                curveTo(8.8f, 16.5f, 7.4f, 18.8f, 7f, 19.6f)
                curveTo(8.5f, 20.5f, 10.2f, 20.9f, 12f, 20.9f)
                reflectiveCurveTo(15.5f, 20.4f, 17f, 19.6f)
                lineTo(14f, 14.4f)
                curveTo(13.4f, 14.8f, 12.7f, 15f, 12f, 15f)
                moveTo(10f, 7.6f)
                curveTo(8.8f, 5.5f, 7.4f, 3.1f, 7f, 2.3f)
                curveTo(4f, 4f, 2f, 7.3f, 2f, 11f)
                horizontalLineTo(8f)
                curveTo(8f, 9.5f, 8.8f, 8.2f, 10f, 7.6f)
                close()
            }
        }.build()

        return _Radioactive!!
    }

@Suppress("ObjectPropertyName")
private var _Radioactive: ImageVector? = null
