package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CloudUpload: ImageVector
    get() {
        if (_CloudUpload != null) {
            return _CloudUpload!!
        }
        _CloudUpload = ImageVector.Builder(
            name = "CloudUpload",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 20f)
                horizontalLineTo(6.5f)
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
                horizontalLineTo(13f)
                verticalLineTo(12.85f)
                lineTo(14.6f, 14.4f)
                lineTo(16f, 13f)
                lineTo(12f, 9f)
                lineTo(8f, 13f)
                lineTo(9.4f, 14.4f)
                lineTo(11f, 12.85f)
                close()
            }
        }.build()

        return _CloudUpload!!
    }

@Suppress("ObjectPropertyName")
private var _CloudUpload: ImageVector? = null
