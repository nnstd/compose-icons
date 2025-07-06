package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CloudDownloadOutline: ImageVector
    get() {
        if (_CloudDownloadOutline != null) {
            return _CloudDownloadOutline!!
        }
        _CloudDownloadOutline = ImageVector.Builder(
            name = "CloudDownloadOutline",
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
                quadTo(5.68f, 7.35f, 7.38f, 5.73f)
                quadTo(9.07f, 4.1f, 11f, 4.1f)
                quadTo(11.83f, 4.1f, 12.41f, 4.69f)
                quadTo(13f, 5.28f, 13f, 6.1f)
                verticalLineTo(12.15f)
                lineTo(14.6f, 10.6f)
                lineTo(16f, 12f)
                lineTo(12f, 16f)
                lineTo(8f, 12f)
                lineTo(9.4f, 10.6f)
                lineTo(11f, 12.15f)
                verticalLineTo(6.1f)
                quadTo(9.1f, 6.45f, 8.05f, 7.94f)
                quadTo(7f, 9.43f, 7f, 11f)
                horizontalLineTo(6.5f)
                quadTo(5.05f, 11f, 4.03f, 12.03f)
                quadTo(3f, 13.05f, 3f, 14.5f)
                quadTo(3f, 15.95f, 4.03f, 17f)
                quadTo(5.05f, 18f, 6.5f, 18f)
                horizontalLineTo(18.5f)
                quadTo(19.55f, 18f, 20.27f, 17.27f)
                quadTo(21f, 16.55f, 21f, 15.5f)
                quadTo(21f, 14.45f, 20.27f, 13.73f)
                quadTo(19.55f, 13f, 18.5f, 13f)
                horizontalLineTo(17f)
                verticalLineTo(11f)
                quadTo(17f, 9.8f, 16.45f, 8.76f)
                quadTo(15.9f, 7.73f, 15f, 7f)
                verticalLineTo(4.68f)
                quadTo(16.85f, 5.55f, 17.93f, 7.26f)
                quadTo(19f, 9f, 19f, 11f)
                quadTo(20.73f, 11.2f, 21.86f, 12.5f)
                quadTo(23f, 13.78f, 23f, 15.5f)
                quadTo(23f, 17.38f, 21.69f, 18.69f)
                quadTo(20.38f, 20f, 18.5f, 20f)
                moveTo(12f, 11.05f)
                close()
            }
        }.build()

        return _CloudDownloadOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CloudDownloadOutline: ImageVector? = null
