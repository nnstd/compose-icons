package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FlagCheckered: ImageVector
    get() {
        if (_FlagCheckered != null) {
            return _FlagCheckered!!
        }
        _FlagCheckered = ImageVector.Builder(
            name = "FlagCheckered",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.4f, 6f)
                horizontalLineTo(20f)
                verticalLineTo(16f)
                horizontalLineTo(13f)
                lineTo(12.6f, 14f)
                horizontalLineTo(7f)
                verticalLineTo(21f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                horizontalLineTo(14f)
                lineTo(14.4f, 6f)
                moveTo(14f, 14f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(18f)
                verticalLineTo(10f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                horizontalLineTo(14f)
                verticalLineTo(10f)
                lineTo(13f, 8f)
                verticalLineTo(6f)
                horizontalLineTo(11f)
                verticalLineTo(8f)
                horizontalLineTo(9f)
                verticalLineTo(6f)
                horizontalLineTo(7f)
                verticalLineTo(8f)
                horizontalLineTo(9f)
                verticalLineTo(10f)
                horizontalLineTo(7f)
                verticalLineTo(12f)
                horizontalLineTo(9f)
                verticalLineTo(10f)
                horizontalLineTo(11f)
                verticalLineTo(12f)
                horizontalLineTo(13f)
                verticalLineTo(10f)
                lineTo(14f, 12f)
                verticalLineTo(14f)
                moveTo(11f, 10f)
                verticalLineTo(8f)
                horizontalLineTo(13f)
                verticalLineTo(10f)
                horizontalLineTo(11f)
                moveTo(14f, 10f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(14f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _FlagCheckered!!
    }

@Suppress("ObjectPropertyName")
private var _FlagCheckered: ImageVector? = null
