package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Store24Hour: ImageVector
    get() {
        if (_Store24Hour != null) {
            return _Store24Hour!!
        }
        _Store24Hour = ImageVector.Builder(
            name = "Store24Hour",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 12f)
                horizontalLineTo(15f)
                verticalLineTo(10f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                horizontalLineTo(14f)
                verticalLineTo(9f)
                horizontalLineTo(15f)
                verticalLineTo(7f)
                horizontalLineTo(16f)
                moveTo(11f, 10f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(12f)
                horizontalLineTo(8f)
                verticalLineTo(9f)
                horizontalLineTo(10f)
                verticalLineTo(8f)
                horizontalLineTo(8f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                moveTo(19f, 7f)
                verticalLineTo(4f)
                horizontalLineTo(5f)
                verticalLineTo(7f)
                horizontalLineTo(2f)
                verticalLineTo(20f)
                horizontalLineTo(10f)
                verticalLineTo(16f)
                horizontalLineTo(14f)
                verticalLineTo(20f)
                horizontalLineTo(22f)
                verticalLineTo(7f)
                horizontalLineTo(19f)
                close()
            }
        }.build()

        return _Store24Hour!!
    }

@Suppress("ObjectPropertyName")
private var _Store24Hour: ImageVector? = null
