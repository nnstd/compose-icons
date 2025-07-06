package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PlusMinusVariant: ImageVector
    get() {
        if (_PlusMinusVariant != null) {
            return _PlusMinusVariant!!
        }
        _PlusMinusVariant = ImageVector.Builder(
            name = "PlusMinusVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 7f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                horizontalLineTo(8f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                horizontalLineTo(8f)
                verticalLineTo(12f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                verticalLineTo(7f)
                moveTo(13f, 15f)
                horizontalLineTo(21f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                moveTo(16.04f, 3f)
                horizontalLineTo(18.35f)
                lineTo(7.96f, 21f)
                horizontalLineTo(5.65f)
                lineTo(16.04f, 3f)
                close()
            }
        }.build()

        return _PlusMinusVariant!!
    }

@Suppress("ObjectPropertyName")
private var _PlusMinusVariant: ImageVector? = null
