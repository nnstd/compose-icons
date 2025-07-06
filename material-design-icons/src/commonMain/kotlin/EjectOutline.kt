package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EjectOutline: ImageVector
    get() {
        if (_EjectOutline != null) {
            return _EjectOutline!!
        }
        _EjectOutline = ImageVector.Builder(
            name = "EjectOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 17f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(17f)
                moveTo(12f, 5f)
                lineTo(5.33f, 15f)
                horizontalLineTo(18.67f)
                lineTo(12f, 5f)
                moveTo(12f, 8.6f)
                lineTo(14.93f, 13f)
                horizontalLineTo(9.07f)
                lineTo(12f, 8.6f)
                close()
            }
        }.build()

        return _EjectOutline!!
    }

@Suppress("ObjectPropertyName")
private var _EjectOutline: ImageVector? = null
