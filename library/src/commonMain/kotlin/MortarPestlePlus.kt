package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MortarPestlePlus: ImageVector
    get() {
        if (_MortarPestlePlus != null) {
            return _MortarPestlePlus!!
        }
        _MortarPestlePlus = ImageVector.Builder(
            name = "MortarPestlePlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 14f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                horizontalLineTo(8f)
                verticalLineTo(12f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                moveTo(21f, 5f)
                horizontalLineTo(18.35f)
                lineTo(19.5f, 1.85f)
                lineTo(17.15f, 1f)
                lineTo(15.69f, 5f)
                horizontalLineTo(3f)
                verticalLineTo(7f)
                lineTo(5f, 13f)
                lineTo(3f, 19f)
                verticalLineTo(21f)
                horizontalLineTo(21f)
                verticalLineTo(19f)
                lineTo(19f, 13f)
                lineTo(21f, 7f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _MortarPestlePlus!!
    }

@Suppress("ObjectPropertyName")
private var _MortarPestlePlus: ImageVector? = null
