package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlertPlus: ImageVector
    get() {
        if (_AlertPlus != null) {
            return _AlertPlus!!
        }
        _AlertPlus = ImageVector.Builder(
            name = "AlertPlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 19f)
                curveTo(14f, 16.21f, 15.91f, 13.87f, 18.5f, 13.2f)
                lineTo(12f, 2f)
                lineTo(1f, 21f)
                horizontalLineTo(14.35f)
                curveTo(14.13f, 20.37f, 14f, 19.7f, 14f, 19f)
                moveTo(13f, 18f)
                horizontalLineTo(11f)
                verticalLineTo(16f)
                horizontalLineTo(13f)
                verticalLineTo(18f)
                moveTo(13f, 14f)
                horizontalLineTo(11f)
                verticalLineTo(10f)
                horizontalLineTo(13f)
                verticalLineTo(14f)
                moveTo(21f, 15f)
                verticalLineTo(18f)
                horizontalLineTo(24f)
                verticalLineTo(20f)
                horizontalLineTo(21f)
                verticalLineTo(23f)
                horizontalLineTo(19f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                verticalLineTo(18f)
                horizontalLineTo(19f)
                verticalLineTo(15f)
                horizontalLineTo(21f)
                close()
            }
        }.build()

        return _AlertPlus!!
    }

@Suppress("ObjectPropertyName")
private var _AlertPlus: ImageVector? = null
