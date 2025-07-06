package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CheckOutline: ImageVector
    get() {
        if (_CheckOutline != null) {
            return _CheckOutline!!
        }
        _CheckOutline = ImageVector.Builder(
            name = "CheckOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.78f, 2.2f)
                lineTo(24f, 6.42f)
                lineTo(8.44f, 22f)
                lineTo(0f, 13.55f)
                lineTo(4.22f, 9.33f)
                lineTo(8.44f, 13.55f)
                lineTo(19.78f, 2.2f)
                moveTo(19.78f, 5f)
                lineTo(8.44f, 16.36f)
                lineTo(4.22f, 12.19f)
                lineTo(2.81f, 13.55f)
                lineTo(8.44f, 19.17f)
                lineTo(21.19f, 6.42f)
                lineTo(19.78f, 5f)
                close()
            }
        }.build()

        return _CheckOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CheckOutline: ImageVector? = null
