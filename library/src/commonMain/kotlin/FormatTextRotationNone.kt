package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatTextRotationNone: ImageVector
    get() {
        if (_FormatTextRotationNone != null) {
            return _FormatTextRotationNone!!
        }
        _FormatTextRotationNone = ImageVector.Builder(
            name = "FormatTextRotationNone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 18f)
                lineTo(17.5f, 21f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(17f)
                horizontalLineTo(17.5f)
                verticalLineTo(15f)
                lineTo(20.5f, 18f)
                moveTo(10.13f, 10f)
                horizontalLineTo(13.88f)
                lineTo(12f, 4.97f)
                lineTo(10.13f, 10f)
                moveTo(12.75f, 3f)
                lineTo(17.5f, 14f)
                horizontalLineTo(15.42f)
                lineTo(14.5f, 11.81f)
                horizontalLineTo(9.5f)
                lineTo(8.58f, 14f)
                horizontalLineTo(6.5f)
                lineTo(11.25f, 3f)
                horizontalLineTo(12.75f)
                close()
            }
        }.build()

        return _FormatTextRotationNone!!
    }

@Suppress("ObjectPropertyName")
private var _FormatTextRotationNone: ImageVector? = null
