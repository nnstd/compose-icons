package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CloudDownload: ImageVector
    get() {
        if (_CloudDownload != null) {
            return _CloudDownload!!
        }
        _CloudDownload = ImageVector.Builder(
            name = "CloudDownload",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.5f, 20f)
                quadTo(4.22f, 20f, 2.61f, 18.43f)
                quadTo(1f, 16.85f, 1f, 14.58f)
                quadTo(1f, 12.63f, 2.17f, 11.1f)
                quadTo(3.35f, 9.57f, 5.25f, 9.15f)
                quadTo(5.83f, 7.13f, 7.39f, 5.75f)
                quadTo(8.95f, 4.38f, 11f, 4.08f)
                verticalLineTo(12.15f)
                lineTo(9.4f, 10.6f)
                lineTo(8f, 12f)
                lineTo(12f, 16f)
                lineTo(16f, 12f)
                lineTo(14.6f, 10.6f)
                lineTo(13f, 12.15f)
                verticalLineTo(4.08f)
                quadTo(15.58f, 4.43f, 17.29f, 6.39f)
                quadTo(19f, 8.35f, 19f, 11f)
                quadTo(20.73f, 11.2f, 21.86f, 12.5f)
                quadTo(23f, 13.78f, 23f, 15.5f)
                quadTo(23f, 17.38f, 21.69f, 18.69f)
                quadTo(20.38f, 20f, 18.5f, 20f)
                close()
            }
        }.build()

        return _CloudDownload!!
    }

@Suppress("ObjectPropertyName")
private var _CloudDownload: ImageVector? = null
