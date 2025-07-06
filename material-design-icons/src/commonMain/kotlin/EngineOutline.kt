package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EngineOutline: ImageVector
    get() {
        if (_EngineOutline != null) {
            return _EngineOutline!!
        }
        _EngineOutline = ImageVector.Builder(
            name = "EngineOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 10f)
                horizontalLineTo(16f)
                verticalLineTo(18f)
                horizontalLineTo(11f)
                lineTo(9f, 16f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                moveTo(7f, 4f)
                verticalLineTo(6f)
                horizontalLineTo(10f)
                verticalLineTo(8f)
                horizontalLineTo(7f)
                lineTo(5f, 10f)
                verticalLineTo(13f)
                horizontalLineTo(3f)
                verticalLineTo(10f)
                horizontalLineTo(1f)
                verticalLineTo(18f)
                horizontalLineTo(3f)
                verticalLineTo(15f)
                horizontalLineTo(5f)
                verticalLineTo(18f)
                horizontalLineTo(8f)
                lineTo(10f, 20f)
                horizontalLineTo(18f)
                verticalLineTo(16f)
                horizontalLineTo(20f)
                verticalLineTo(19f)
                horizontalLineTo(23f)
                verticalLineTo(9f)
                horizontalLineTo(20f)
                verticalLineTo(12f)
                horizontalLineTo(18f)
                verticalLineTo(8f)
                horizontalLineTo(12f)
                verticalLineTo(6f)
                horizontalLineTo(15f)
                verticalLineTo(4f)
                horizontalLineTo(7f)
                close()
            }
        }.build()

        return _EngineOutline!!
    }

@Suppress("ObjectPropertyName")
private var _EngineOutline: ImageVector? = null
