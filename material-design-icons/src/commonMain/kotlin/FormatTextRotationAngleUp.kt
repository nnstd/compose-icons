package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatTextRotationAngleUp: ImageVector
    get() {
        if (_FormatTextRotationAngleUp != null) {
            return _FormatTextRotationAngleUp!!
        }
        _FormatTextRotationAngleUp = ImageVector.Builder(
            name = "FormatTextRotationAngleUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.58f, 9.33f)
                verticalLineTo(13.55f)
                lineTo(19.17f, 12.14f)
                lineTo(10.31f, 21f)
                lineTo(8.91f, 19.59f)
                lineTo(17.72f, 10.73f)
                lineTo(16.31f, 9.33f)
                moveTo(7.59f, 11f)
                lineTo(10.22f, 8.39f)
                lineTo(5.34f, 6.14f)
                moveTo(4.5f, 4.22f)
                lineTo(15.61f, 8.63f)
                lineTo(14.16f, 10.13f)
                lineTo(11.96f, 9.19f)
                lineTo(8.39f, 12.75f)
                lineTo(9.33f, 14.91f)
                lineTo(7.83f, 16.41f)
                lineTo(3.42f, 5.25f)
                close()
            }
        }.build()

        return _FormatTextRotationAngleUp!!
    }

@Suppress("ObjectPropertyName")
private var _FormatTextRotationAngleUp: ImageVector? = null
