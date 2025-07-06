package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SignCaution: ImageVector
    get() {
        if (_SignCaution != null) {
            return _SignCaution!!
        }
        _SignCaution = ImageVector.Builder(
            name = "SignCaution",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 3f)
                horizontalLineTo(22f)
                verticalLineTo(13f)
                horizontalLineTo(18f)
                verticalLineTo(21f)
                horizontalLineTo(16f)
                verticalLineTo(13f)
                horizontalLineTo(8f)
                verticalLineTo(21f)
                horizontalLineTo(6f)
                verticalLineTo(13f)
                horizontalLineTo(2f)
                verticalLineTo(3f)
                moveTo(18.97f, 11f)
                lineTo(20f, 9.97f)
                verticalLineTo(7.15f)
                lineTo(16.15f, 11f)
                horizontalLineTo(18.97f)
                moveTo(13.32f, 11f)
                lineTo(19.32f, 5f)
                horizontalLineTo(16.5f)
                lineTo(10.5f, 11f)
                horizontalLineTo(13.32f)
                moveTo(7.66f, 11f)
                lineTo(13.66f, 5f)
                horizontalLineTo(10.83f)
                lineTo(4.83f, 11f)
                horizontalLineTo(7.66f)
                moveTo(5.18f, 5f)
                lineTo(4f, 6.18f)
                verticalLineTo(9f)
                lineTo(8f, 5f)
                horizontalLineTo(5.18f)
                close()
            }
        }.build()

        return _SignCaution!!
    }

@Suppress("ObjectPropertyName")
private var _SignCaution: ImageVector? = null
