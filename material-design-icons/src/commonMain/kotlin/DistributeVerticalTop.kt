package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DistributeVerticalTop: ImageVector
    get() {
        if (_DistributeVerticalTop != null) {
            return _DistributeVerticalTop!!
        }
        _DistributeVerticalTop = ImageVector.Builder(
            name = "DistributeVerticalTop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 21f)
                horizontalLineTo(7f)
                verticalLineTo(16f)
                horizontalLineTo(2f)
                verticalLineTo(14f)
                horizontalLineTo(22f)
                verticalLineTo(16f)
                horizontalLineTo(17f)
                verticalLineTo(21f)
                moveTo(22f, 5f)
                verticalLineTo(3f)
                horizontalLineTo(2f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(10f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                horizontalLineTo(22f)
                close()
            }
        }.build()

        return _DistributeVerticalTop!!
    }

@Suppress("ObjectPropertyName")
private var _DistributeVerticalTop: ImageVector? = null
