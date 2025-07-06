package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlphaJ: ImageVector
    get() {
        if (_AlphaJ != null) {
            return _AlphaJ!!
        }
        _AlphaJ = ImageVector.Builder(
            name = "AlphaJ",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 7f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                horizontalLineTo(9f)
                verticalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 17f)
                horizontalLineTo(13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 15f)
                verticalLineTo(7f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _AlphaJ!!
    }

@Suppress("ObjectPropertyName")
private var _AlphaJ: ImageVector? = null
