package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LedStripVariant: ImageVector
    get() {
        if (_LedStripVariant != null) {
            return _LedStripVariant!!
        }
        _LedStripVariant = ImageVector.Builder(
            name = "LedStripVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.95f, 3f)
                lineTo(2f, 6.91f)
                lineTo(19.34f, 11.25f)
                lineTo(20.29f, 7.34f)
                lineTo(2.95f, 3f)
                moveTo(6.09f, 6.89f)
                lineTo(4.16f, 6.41f)
                lineTo(4.64f, 4.46f)
                lineTo(6.57f, 4.94f)
                lineTo(6.09f, 6.89f)
                moveTo(9.94f, 7.86f)
                lineTo(8f, 7.38f)
                lineTo(8.5f, 5.42f)
                lineTo(10.42f, 5.91f)
                lineTo(9.94f, 7.86f)
                moveTo(13.8f, 8.82f)
                lineTo(11.87f, 8.34f)
                lineTo(12.35f, 6.39f)
                lineTo(14.27f, 6.87f)
                lineTo(13.8f, 8.82f)
                moveTo(17.65f, 9.79f)
                lineTo(15.72f, 9.31f)
                lineTo(16.2f, 7.35f)
                lineTo(18.13f, 7.84f)
                lineTo(17.65f, 9.79f)
                moveTo(4.66f, 12.75f)
                lineTo(3.71f, 16.66f)
                lineTo(21.05f, 21f)
                lineTo(22f, 17.1f)
                lineTo(4.66f, 12.75f)
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
                lineTo(16f, 16.62f)
                lineTo(15.5f, 18.58f)
                moveTo(19.36f, 19.54f)
                lineTo(17.43f, 19.06f)
                lineTo(17.91f, 17.11f)
                lineTo(19.84f, 17.59f)
                lineTo(19.36f, 19.54f)
                moveTo(6.25f, 12.11f)
                lineTo(11f, 10.2f)
                lineTo(17.75f, 11.89f)
                lineTo(13f, 13.8f)
                lineTo(6.25f, 12.11f)
                close()
            }
        }.build()

        return _LedStripVariant!!
    }

@Suppress("ObjectPropertyName")
private var _LedStripVariant: ImageVector? = null
