package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LeadPencil: ImageVector
    get() {
        if (_LeadPencil != null) {
            return _LeadPencil!!
        }
        _LeadPencil = ImageVector.Builder(
            name = "LeadPencil",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.84f, 2.73f)
                curveTo(16.45f, 2.73f, 16.07f, 2.88f, 15.77f, 3.17f)
                lineTo(13.65f, 5.29f)
                lineTo(18.95f, 10.6f)
                lineTo(21.07f, 8.5f)
                curveTo(21.67f, 7.89f, 21.67f, 6.94f, 21.07f, 6.36f)
                lineTo(17.9f, 3.17f)
                curveTo(17.6f, 2.88f, 17.22f, 2.73f, 16.84f, 2.73f)
                moveTo(12.94f, 6f)
                lineTo(4.84f, 14.11f)
                lineTo(7.4f, 14.39f)
                lineTo(7.58f, 16.68f)
                lineTo(9.86f, 16.85f)
                lineTo(10.15f, 19.41f)
                lineTo(18.25f, 11.3f)
                moveTo(4.25f, 15.04f)
                lineTo(2.5f, 21.73f)
                lineTo(9.2f, 19.94f)
                lineTo(8.96f, 17.78f)
                lineTo(6.65f, 17.61f)
                lineTo(6.47f, 15.29f)
            }
        }.build()

        return _LeadPencil!!
    }

@Suppress("ObjectPropertyName")
private var _LeadPencil: ImageVector? = null
