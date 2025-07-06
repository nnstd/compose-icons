package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CloudOffOutline: ImageVector
    get() {
        if (_CloudOffOutline != null) {
            return _CloudOffOutline!!
        }
        _CloudOffOutline = ImageVector.Builder(
            name = "CloudOffOutline",
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
                moveTo(6.5f, 18f)
                horizontalLineTo(15.15f)
                lineTo(7.1f, 9.95f)
                quadTo(7.05f, 10.23f, 7.03f, 10.5f)
                quadTo(7f, 10.73f, 7f, 11f)
                horizontalLineTo(6.5f)
                quadTo(5.05f, 11f, 4.03f, 12.03f)
                quadTo(3f, 13.05f, 3f, 14.5f)
                quadTo(3f, 15.95f, 4.03f, 17f)
                quadTo(5.05f, 18f, 6.5f, 18f)
                moveTo(11.13f, 14f)
                moveTo(21.6f, 18.75f)
                lineTo(20.15f, 17.35f)
                quadTo(20.58f, 17f, 20.79f, 16.54f)
                quadTo(21f, 16.08f, 21f, 15.5f)
                quadTo(21f, 14.45f, 20.27f, 13.73f)
                quadTo(19.55f, 13f, 18.5f, 13f)
                horizontalLineTo(17f)
                verticalLineTo(11f)
                quadTo(17f, 8.93f, 15.54f, 7.46f)
                quadTo(14.08f, 6f, 12f, 6f)
                quadTo(11.33f, 6f, 10.7f, 6.16f)
                quadTo(10.07f, 6.33f, 9.5f, 6.68f)
                lineTo(8.05f, 5.23f)
                quadTo(8.93f, 4.63f, 9.91f, 4.31f)
                quadTo(10.9f, 4f, 12f, 4f)
                quadTo(14.93f, 4f, 16.96f, 6.04f)
                quadTo(19f, 8.07f, 19f, 11f)
                quadTo(20.73f, 11.2f, 21.86f, 12.5f)
                quadTo(23f, 13.78f, 23f, 15.5f)
                quadTo(23f, 16.5f, 22.63f, 17.31f)
                quadTo(22.25f, 18.15f, 21.6f, 18.75f)
                moveTo(14.83f, 12.03f)
                close()
            }
        }.build()

        return _CloudOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CloudOffOutline: ImageVector? = null
