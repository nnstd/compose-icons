package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WifiCancel: ImageVector
    get() {
        if (_WifiCancel != null) {
            return _WifiCancel!!
        }
        _WifiCancel = ImageVector.Builder(
            name = "WifiCancel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 6f)
                curveTo(8.62f, 6f, 5.5f, 7.12f, 3f, 9f)
                lineTo(1.2f, 6.6f)
                curveTo(4.21f, 4.34f, 7.95f, 3f, 12f, 3f)
                reflectiveCurveTo(19.79f, 4.34f, 22.8f, 6.6f)
                lineTo(21f, 9f)
                curveTo(18.5f, 7.12f, 15.38f, 6f, 12f, 6f)
                moveTo(15.53f, 12.72f)
                curveTo(16.42f, 12.26f, 17.43f, 12f, 18.5f, 12f)
                curveTo(18.58f, 12f, 18.66f, 12f, 18.74f, 12f)
                lineTo(19.2f, 11.4f)
                curveTo(17.19f, 9.89f, 14.7f, 9f, 12f, 9f)
                reflectiveCurveTo(6.81f, 9.89f, 4.8f, 11.4f)
                lineTo(6.6f, 13.8f)
                curveTo(8.1f, 12.67f, 9.97f, 12f, 12f, 12f)
                curveTo(13.26f, 12f, 14.45f, 12.26f, 15.53f, 12.72f)
                moveTo(12f, 15f)
                curveTo(10.65f, 15f, 9.4f, 15.45f, 8.4f, 16.2f)
                lineTo(12f, 21f)
                lineTo(12.34f, 20.54f)
                curveTo(12.13f, 19.9f, 12f, 19.22f, 12f, 18.5f)
                curveTo(12f, 17.24f, 12.36f, 16.08f, 13f, 15.08f)
                curveTo(12.66f, 15.03f, 12.33f, 15f, 12f, 15f)
                moveTo(23f, 18.5f)
                curveTo(23f, 21f, 21f, 23f, 18.5f, 23f)
                reflectiveCurveTo(14f, 21f, 14f, 18.5f)
                reflectiveCurveTo(16f, 14f, 18.5f, 14f)
                reflectiveCurveTo(23f, 16f, 23f, 18.5f)
                moveTo(20f, 21.08f)
                lineTo(15.92f, 17f)
                curveTo(15.65f, 17.42f, 15.5f, 17.94f, 15.5f, 18.5f)
                curveTo(15.5f, 20.16f, 16.84f, 21.5f, 18.5f, 21.5f)
                curveTo(19.06f, 21.5f, 19.58f, 21.35f, 20f, 21.08f)
                moveTo(21.5f, 18.5f)
                curveTo(21.5f, 16.84f, 20.16f, 15.5f, 18.5f, 15.5f)
                curveTo(17.94f, 15.5f, 17.42f, 15.65f, 17f, 15.92f)
                lineTo(21.08f, 20f)
                curveTo(21.35f, 19.58f, 21.5f, 19.06f, 21.5f, 18.5f)
                close()
            }
        }.build()

        return _WifiCancel!!
    }

@Suppress("ObjectPropertyName")
private var _WifiCancel: ImageVector? = null
