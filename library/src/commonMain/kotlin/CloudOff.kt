package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CloudOff: ImageVector
    get() {
        if (_CloudOff != null) {
            return _CloudOff!!
        }
        _CloudOff = ImageVector.Builder(
            name = "CloudOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.8f, 22.6f)
                lineTo(17.15f, 20f)
                horizontalLineTo(6.5f)
                quadTo(4.2f, 20f, 2.6f, 18.4f)
                reflectiveQuadTo(1f, 14.5f)
                quadTo(1f, 12.58f, 2.19f, 11.08f)
                quadTo(3.38f, 9.57f, 5.25f, 9.15f)
                quadTo(5.33f, 8.95f, 5.4f, 8.76f)
                quadTo(5.5f, 8.57f, 5.55f, 8.35f)
                lineTo(1.4f, 4.2f)
                lineTo(2.8f, 2.8f)
                lineTo(21.2f, 21.2f)
                moveTo(21.6f, 18.75f)
                lineTo(8.05f, 5.23f)
                quadTo(8.93f, 4.63f, 9.91f, 4.31f)
                quadTo(10.9f, 4f, 12f, 4f)
                quadTo(14.93f, 4f, 16.96f, 6.04f)
                quadTo(19f, 8.07f, 19f, 11f)
                quadTo(20.73f, 11.2f, 21.86f, 12.5f)
                quadTo(23f, 13.78f, 23f, 15.5f)
                quadTo(23f, 16.5f, 22.63f, 17.31f)
                quadTo(22.25f, 18.15f, 21.6f, 18.75f)
                close()
            }
        }.build()

        return _CloudOff!!
    }

@Suppress("ObjectPropertyName")
private var _CloudOff: ImageVector? = null
