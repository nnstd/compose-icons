package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AutoFix: ImageVector
    get() {
        if (_AutoFix != null) {
            return _AutoFix!!
        }
        _AutoFix = ImageVector.Builder(
            name = "AutoFix",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.5f, 5.6f)
                lineTo(5f, 7f)
                lineTo(6.4f, 4.5f)
                lineTo(5f, 2f)
                lineTo(7.5f, 3.4f)
                lineTo(10f, 2f)
                lineTo(8.6f, 4.5f)
                lineTo(10f, 7f)
                lineTo(7.5f, 5.6f)
                moveTo(19.5f, 15.4f)
                lineTo(22f, 14f)
                lineTo(20.6f, 16.5f)
                lineTo(22f, 19f)
                lineTo(19.5f, 17.6f)
                lineTo(17f, 19f)
                lineTo(18.4f, 16.5f)
                lineTo(17f, 14f)
                lineTo(19.5f, 15.4f)
                moveTo(22f, 2f)
                lineTo(20.6f, 4.5f)
                lineTo(22f, 7f)
                lineTo(19.5f, 5.6f)
                lineTo(17f, 7f)
                lineTo(18.4f, 4.5f)
                lineTo(17f, 2f)
                lineTo(19.5f, 3.4f)
                lineTo(22f, 2f)
                moveTo(13.34f, 12.78f)
                lineTo(15.78f, 10.34f)
                lineTo(13.66f, 8.22f)
                lineTo(11.22f, 10.66f)
                lineTo(13.34f, 12.78f)
                moveTo(14.37f, 7.29f)
                lineTo(16.71f, 9.63f)
                curveTo(17.1f, 10f, 17.1f, 10.65f, 16.71f, 11.04f)
                lineTo(5.04f, 22.71f)
                curveTo(4.65f, 23.1f, 4f, 23.1f, 3.63f, 22.71f)
                lineTo(1.29f, 20.37f)
                curveTo(0.9f, 20f, 0.9f, 19.35f, 1.29f, 18.96f)
                lineTo(12.96f, 7.29f)
                curveTo(13.35f, 6.9f, 14f, 6.9f, 14.37f, 7.29f)
                close()
            }
        }.build()

        return _AutoFix!!
    }

@Suppress("ObjectPropertyName")
private var _AutoFix: ImageVector? = null
