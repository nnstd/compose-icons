package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Numeric1: ImageVector
    get() {
        if (_Numeric1 != null) {
            return _Numeric1!!
        }
        _Numeric1 = ImageVector.Builder(
            name = "Numeric1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(12f)
                verticalLineTo(17f)
                horizontalLineTo(14f)
                verticalLineTo(7f)
                horizontalLineTo(10f)
                close()
            }
        }.build()

        return _Numeric1!!
    }

@Suppress("ObjectPropertyName")
private var _Numeric1: ImageVector? = null
