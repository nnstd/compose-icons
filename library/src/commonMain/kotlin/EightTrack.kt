package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EightTrack: ImageVector
    get() {
        if (_EightTrack != null) {
            return _EightTrack!!
        }
        _EightTrack = ImageVector.Builder(
            name = "EightTrack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 2f)
                lineTo(5f, 5f)
                verticalLineTo(16f)
                lineTo(6f, 20f)
                curveTo(6.27f, 21.07f, 6.9f, 22f, 8f, 22f)
                horizontalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 20f)
                lineTo(19f, 16f)
                verticalLineTo(5f)
                lineTo(17f, 2f)
                horizontalLineTo(15f)
                verticalLineTo(3f)
                horizontalLineTo(13f)
                verticalLineTo(2f)
                horizontalLineTo(7f)
                moveTo(7f, 6f)
                horizontalLineTo(17f)
                verticalLineTo(16f)
                horizontalLineTo(7f)
                verticalLineTo(6f)
                close()
            }
        }.build()

        return _EightTrack!!
    }

@Suppress("ObjectPropertyName")
private var _EightTrack: ImageVector? = null
