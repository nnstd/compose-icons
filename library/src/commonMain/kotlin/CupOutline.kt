package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CupOutline: ImageVector
    get() {
        if (_CupOutline != null) {
            return _CupOutline!!
        }
        _CupOutline = ImageVector.Builder(
            name = "CupOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 2f)
                lineTo(5f, 20.23f)
                curveTo(5.13f, 21.23f, 5.97f, 22f, 7f, 22f)
                horizontalLineTo(17f)
                curveTo(18f, 22f, 18.87f, 21.23f, 19f, 20.23f)
                lineTo(21f, 2f)
                horizontalLineTo(3f)
                moveTo(5.22f, 4f)
                horizontalLineTo(18.78f)
                lineTo(17f, 20f)
                horizontalLineTo(7f)
                lineTo(5.22f, 4f)
                close()
            }
        }.build()

        return _CupOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CupOutline: ImageVector? = null
