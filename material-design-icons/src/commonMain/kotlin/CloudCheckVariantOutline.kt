package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CloudCheckVariantOutline: ImageVector
    get() {
        if (_CloudCheckVariantOutline != null) {
            return _CloudCheckVariantOutline!!
        }
        _CloudCheckVariantOutline = ImageVector.Builder(
            name = "CloudCheckVariantOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.35f, 17f)
                lineTo(16f, 11.35f)
                lineTo(14.55f, 9.9f)
                lineTo(10.33f, 14.13f)
                lineTo(8.23f, 12.03f)
                lineTo(6.8f, 13.45f)
                moveTo(6.5f, 20f)
                quadTo(4.22f, 20f, 2.61f, 18.43f)
                quadTo(1f, 16.85f, 1f, 14.58f)
                quadTo(1f, 12.63f, 2.17f, 11.1f)
                quadTo(3.35f, 9.57f, 5.25f, 9.15f)
                quadTo(5.88f, 6.85f, 7.75f, 5.43f)
                quadTo(9.63f, 4f, 12f, 4f)
                quadTo(14.93f, 4f, 16.96f, 6.04f)
                quadTo(19f, 8.07f, 19f, 11f)
                quadTo(20.73f, 11.2f, 21.86f, 12.5f)
                quadTo(23f, 13.78f, 23f, 15.5f)
                quadTo(23f, 17.38f, 21.69f, 18.69f)
                quadTo(20.38f, 20f, 18.5f, 20f)
                moveTo(6.5f, 18f)
                horizontalLineTo(18.5f)
                quadTo(19.55f, 18f, 20.27f, 17.27f)
                quadTo(21f, 16.55f, 21f, 15.5f)
                quadTo(21f, 14.45f, 20.27f, 13.73f)
                quadTo(19.55f, 13f, 18.5f, 13f)
                horizontalLineTo(17f)
                verticalLineTo(11f)
                quadTo(17f, 8.93f, 15.54f, 7.46f)
                quadTo(14.08f, 6f, 12f, 6f)
                quadTo(9.93f, 6f, 8.46f, 7.46f)
                quadTo(7f, 8.93f, 7f, 11f)
                horizontalLineTo(6.5f)
                quadTo(5.05f, 11f, 4.03f, 12.03f)
                quadTo(3f, 13.05f, 3f, 14.5f)
                quadTo(3f, 15.95f, 4.03f, 17f)
                quadTo(5.05f, 18f, 6.5f, 18f)
                moveTo(12f, 12f)
                close()
            }
        }.build()

        return _CloudCheckVariantOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CloudCheckVariantOutline: ImageVector? = null
