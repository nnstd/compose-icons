package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LedStripVariantOff: ImageVector
    get() {
        if (_LedStripVariantOff != null) {
            return _LedStripVariantOff!!
        }
        _LedStripVariantOff = ImageVector.Builder(
            name = "LedStripVariantOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(2.59f, 4.5f)
                lineTo(2f, 6.91f)
                lineTo(6.03f, 7.92f)
                lineTo(9.08f, 10.97f)
                lineTo(6.25f, 12.11f)
                lineTo(11.55f, 13.44f)
                lineTo(12.94f, 14.83f)
                lineTo(4.66f, 12.75f)
                lineTo(3.71f, 16.66f)
                lineTo(18.46f, 20.35f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(7.8f, 16.65f)
                lineTo(5.88f, 16.16f)
                lineTo(6.35f, 14.21f)
                lineTo(8.28f, 14.69f)
                lineTo(7.8f, 16.65f)
                moveTo(11.65f, 17.61f)
                lineTo(9.73f, 17.13f)
                lineTo(10.2f, 15.18f)
                lineTo(12.13f, 15.66f)
                lineTo(11.65f, 17.61f)
                moveTo(15.5f, 18.58f)
                lineTo(13.58f, 18.09f)
                lineTo(14.06f, 16.14f)
                lineTo(14.31f, 16.2f)
                lineTo(15.74f, 17.63f)
                lineTo(15.5f, 18.58f)
                moveTo(19.73f, 16.53f)
                lineTo(22f, 17.1f)
                lineTo(21.67f, 18.47f)
                lineTo(19.73f, 16.53f)
                moveTo(15.85f, 12.65f)
                lineTo(14.2f, 11f)
                lineTo(17.75f, 11.89f)
                lineTo(15.85f, 12.65f)
                moveTo(10.42f, 5.91f)
                lineTo(10.16f, 6.96f)
                lineTo(12.82f, 9.62f)
                lineTo(19.34f, 11.25f)
                lineTo(20.29f, 7.34f)
                lineTo(7.29f, 4.09f)
                lineTo(8.66f, 5.46f)
                lineTo(10.42f, 5.91f)
                moveTo(16.2f, 7.35f)
                lineTo(18.13f, 7.84f)
                lineTo(17.65f, 9.79f)
                lineTo(15.72f, 9.31f)
                lineTo(16.2f, 7.35f)
                moveTo(12.35f, 6.39f)
                lineTo(14.27f, 6.87f)
                lineTo(13.8f, 8.82f)
                lineTo(11.87f, 8.34f)
                lineTo(12.35f, 6.39f)
                close()
            }
        }.build()

        return _LedStripVariantOff!!
    }

@Suppress("ObjectPropertyName")
private var _LedStripVariantOff: ImageVector? = null
