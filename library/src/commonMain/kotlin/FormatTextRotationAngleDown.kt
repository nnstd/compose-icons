package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatTextRotationAngleDown: ImageVector
    get() {
        if (_FormatTextRotationAngleDown != null) {
            return _FormatTextRotationAngleDown!!
        }
        _FormatTextRotationAngleDown = ImageVector.Builder(
            name = "FormatTextRotationAngleDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.25f, 21f)
                horizontalLineTo(10.03f)
                lineTo(11.44f, 19.59f)
                lineTo(2.58f, 10.73f)
                lineTo(4.03f, 9.33f)
                lineTo(12.84f, 18.19f)
                lineTo(14.25f, 16.78f)
                moveTo(12.61f, 8f)
                lineTo(15.23f, 10.64f)
                lineTo(17.43f, 5.77f)
                moveTo(19.41f, 4.92f)
                lineTo(14.95f, 16.03f)
                lineTo(13.5f, 14.58f)
                lineTo(14.39f, 12.38f)
                lineTo(10.88f, 8.81f)
                lineTo(8.68f, 9.75f)
                lineTo(7.22f, 8.25f)
                lineTo(18.33f, 3.84f)
                close()
            }
        }.build()

        return _FormatTextRotationAngleDown!!
    }

@Suppress("ObjectPropertyName")
private var _FormatTextRotationAngleDown: ImageVector? = null
