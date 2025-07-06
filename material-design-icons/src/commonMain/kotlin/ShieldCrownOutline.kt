package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShieldCrownOutline: ImageVector
    get() {
        if (_ShieldCrownOutline != null) {
            return _ShieldCrownOutline!!
        }
        _ShieldCrownOutline = ImageVector.Builder(
            name = "ShieldCrownOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                lineTo(21f, 5f)
                verticalLineTo(11f)
                curveTo(21f, 16.55f, 17.16f, 21.74f, 12f, 23f)
                curveTo(6.84f, 21.74f, 3f, 16.55f, 3f, 11f)
                verticalLineTo(5f)
                lineTo(12f, 1f)
                moveTo(12f, 3.18f)
                lineTo(5f, 6.3f)
                verticalLineTo(11.22f)
                curveTo(5f, 15.54f, 8.25f, 20f, 12f, 21f)
                curveTo(15.75f, 20f, 19f, 15.54f, 19f, 11.22f)
                verticalLineTo(6.3f)
                lineTo(12f, 3.18f)
                moveTo(16f, 14f)
                verticalLineTo(15.5f)
                lineTo(16f, 15.59f)
                curveTo(15.96f, 15.81f, 15.78f, 15.96f, 15.53f, 16f)
                lineTo(15.43f, 16f)
                horizontalLineTo(8.57f)
                lineTo(8.47f, 16f)
                curveTo(8.22f, 15.96f, 8.04f, 15.81f, 8f, 15.59f)
                lineTo(8f, 15.5f)
                verticalLineTo(14f)
                horizontalLineTo(16f)
                moveTo(17f, 8f)
                lineTo(16f, 13f)
                horizontalLineTo(8f)
                lineTo(7f, 8f)
                lineTo(7f, 8f)
                lineTo(9.67f, 10.67f)
                lineTo(12f, 8.34f)
                lineTo(14.33f, 10.67f)
                lineTo(17f, 8f)
                lineTo(17f, 8f)
                close()
            }
        }.build()

        return _ShieldCrownOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldCrownOutline: ImageVector? = null
