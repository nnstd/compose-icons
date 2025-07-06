package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatSection: ImageVector
    get() {
        if (_FormatSection != null) {
            return _FormatSection!!
        }
        _FormatSection = ImageVector.Builder(
            name = "FormatSection",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.67f, 4.42f)
                curveTo(14.7f, 3.84f, 13.58f, 3.54f, 12.45f, 3.56f)
                curveTo(10.87f, 3.56f, 9.66f, 4.34f, 9.66f, 5.56f)
                curveTo(9.66f, 6.96f, 11f, 7.47f, 13f, 8.14f)
                curveTo(15.5f, 8.95f, 17.4f, 9.97f, 17.4f, 12.38f)
                curveTo(17.36f, 13.69f, 16.69f, 14.89f, 15.6f, 15.61f)
                curveTo(16.25f, 16.22f, 16.61f, 17.08f, 16.6f, 17.97f)
                curveTo(16.6f, 20.79f, 14f, 21.97f, 11.5f, 21.97f)
                curveTo(10.04f, 22.03f, 8.59f, 21.64f, 7.35f, 20.87f)
                lineTo(8f, 19.34f)
                curveTo(9.04f, 20.05f, 10.27f, 20.43f, 11.53f, 20.44f)
                curveTo(13.25f, 20.44f, 14.53f, 19.66f, 14.53f, 18.24f)
                curveTo(14.53f, 17f, 13.75f, 16.31f, 11.25f, 15.45f)
                curveTo(8.5f, 14.5f, 6.6f, 13.5f, 6.6f, 11.21f)
                curveTo(6.67f, 9.89f, 7.43f, 8.69f, 8.6f, 8.07f)
                curveTo(7.97f, 7.5f, 7.61f, 6.67f, 7.6f, 5.81f)
                curveTo(7.6f, 3.45f, 9.77f, 2f, 12.53f, 2f)
                curveTo(13.82f, 2f, 15.09f, 2.29f, 16.23f, 2.89f)
                lineTo(15.67f, 4.42f)
                moveTo(11.35f, 13.42f)
                curveTo(12.41f, 13.75f, 13.44f, 14.18f, 14.41f, 14.71f)
                curveTo(15.06f, 14.22f, 15.43f, 13.45f, 15.41f, 12.64f)
                curveTo(15.41f, 11.64f, 14.77f, 10.76f, 13f, 10.14f)
                curveTo(11.89f, 9.77f, 10.78f, 9.31f, 9.72f, 8.77f)
                curveTo(8.97f, 9.22f, 8.5f, 10.03f, 8.5f, 10.91f)
                curveTo(8.5f, 11.88f, 9.23f, 12.68f, 11.35f, 13.42f)
                close()
            }
        }.build()

        return _FormatSection!!
    }

@Suppress("ObjectPropertyName")
private var _FormatSection: ImageVector? = null
