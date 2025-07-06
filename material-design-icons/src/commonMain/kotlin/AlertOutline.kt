package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlertOutline: ImageVector
    get() {
        if (_AlertOutline != null) {
            return _AlertOutline!!
        }
        _AlertOutline = ImageVector.Builder(
            name = "AlertOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                lineTo(1f, 21f)
                horizontalLineTo(23f)
                moveTo(12f, 6f)
                lineTo(19.53f, 19f)
                horizontalLineTo(4.47f)
                moveTo(11f, 10f)
                verticalLineTo(14f)
                horizontalLineTo(13f)
                verticalLineTo(10f)
                moveTo(11f, 16f)
                verticalLineTo(18f)
                horizontalLineTo(13f)
                verticalLineTo(16f)
            }
        }.build()

        return _AlertOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AlertOutline: ImageVector? = null
