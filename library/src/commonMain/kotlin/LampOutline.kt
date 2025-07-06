package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LampOutline: ImageVector
    get() {
        if (_LampOutline != null) {
            return _LampOutline!!
        }
        _LampOutline = ImageVector.Builder(
            name = "LampOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.56f, 4f)
                lineTo(17.23f, 12f)
                horizontalLineTo(6.78f)
                lineTo(9.44f, 4f)
                horizontalLineTo(14.56f)
                moveTo(16f, 2f)
                horizontalLineTo(8f)
                lineTo(4f, 14f)
                horizontalLineTo(20f)
                lineTo(16f, 2f)
                moveTo(11f, 15f)
                horizontalLineTo(13f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                verticalLineTo(22f)
                horizontalLineTo(6f)
                verticalLineTo(20f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _LampOutline!!
    }

@Suppress("ObjectPropertyName")
private var _LampOutline: ImageVector? = null
