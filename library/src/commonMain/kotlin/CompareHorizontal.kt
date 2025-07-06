package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CompareHorizontal: ImageVector
    get() {
        if (_CompareHorizontal != null) {
            return _CompareHorizontal!!
        }
        _CompareHorizontal = ImageVector.Builder(
            name = "CompareHorizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 14f)
                horizontalLineTo(2f)
                verticalLineTo(16f)
                horizontalLineTo(9f)
                verticalLineTo(19f)
                lineTo(13f, 15f)
                lineTo(9f, 11f)
                verticalLineTo(14f)
                moveTo(15f, 13f)
                verticalLineTo(10f)
                horizontalLineTo(22f)
                verticalLineTo(8f)
                horizontalLineTo(15f)
                verticalLineTo(5f)
                lineTo(11f, 9f)
                lineTo(15f, 13f)
                close()
            }
        }.build()

        return _CompareHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _CompareHorizontal: ImageVector? = null
