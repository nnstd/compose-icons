package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Cone: ImageVector
    get() {
        if (_Cone != null) {
            return _Cone!!
        }
        _Cone = ImageVector.Builder(
            name = "Cone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.62f, 16.68f)
                horizontalLineTo(21.62f)
                lineTo(12.85f, 2.5f)
                curveTo(12.66f, 2.16f, 12.33f, 2f, 12f, 2f)
                curveTo(11.67f, 2f, 11.34f, 2.16f, 11.15f, 2.47f)
                lineTo(2.38f, 16.65f)
                horizontalLineTo(2.4f)
                curveTo(2.15f, 17.04f, 2f, 17.5f, 2f, 18f)
                curveTo(2f, 19.5f, 3.3f, 22f, 12f, 22f)
                curveTo(15.74f, 22f, 22f, 21.5f, 22f, 18f)
                curveTo(22f, 17.61f, 21.91f, 17.15f, 21.62f, 16.68f)
                moveTo(12f, 4.9f)
                lineTo(18f, 14.58f)
                curveTo(16.53f, 14.23f, 14.6f, 14f, 12f, 14f)
                curveTo(10.25f, 14f, 7.96f, 14.12f, 6f, 14.6f)
                lineTo(12f, 4.9f)
                moveTo(12f, 20f)
                curveTo(7.58f, 20f, 4f, 19.11f, 4f, 18f)
                curveTo(4f, 16.9f, 7.58f, 16f, 12f, 16f)
                reflectiveCurveTo(20f, 16.9f, 20f, 18f)
                curveTo(20f, 19.11f, 16.42f, 20f, 12f, 20f)
                close()
            }
        }.build()

        return _Cone!!
    }

@Suppress("ObjectPropertyName")
private var _Cone: ImageVector? = null
