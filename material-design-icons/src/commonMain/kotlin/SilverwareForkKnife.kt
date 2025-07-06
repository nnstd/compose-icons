package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SilverwareForkKnife: ImageVector
    get() {
        if (_SilverwareForkKnife != null) {
            return _SilverwareForkKnife!!
        }
        _SilverwareForkKnife = ImageVector.Builder(
            name = "SilverwareForkKnife",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 9f)
                horizontalLineTo(9f)
                verticalLineTo(2f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                horizontalLineTo(5f)
                verticalLineTo(2f)
                horizontalLineTo(3f)
                verticalLineTo(9f)
                curveTo(3f, 11.12f, 4.66f, 12.84f, 6.75f, 12.97f)
                verticalLineTo(22f)
                horizontalLineTo(9.25f)
                verticalLineTo(12.97f)
                curveTo(11.34f, 12.84f, 13f, 11.12f, 13f, 9f)
                verticalLineTo(2f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                moveTo(16f, 6f)
                verticalLineTo(14f)
                horizontalLineTo(18.5f)
                verticalLineTo(22f)
                horizontalLineTo(21f)
                verticalLineTo(2f)
                curveTo(18.24f, 2f, 16f, 4.24f, 16f, 6f)
                close()
            }
        }.build()

        return _SilverwareForkKnife!!
    }

@Suppress("ObjectPropertyName")
private var _SilverwareForkKnife: ImageVector? = null
