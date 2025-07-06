package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DistributeHorizontalCenter: ImageVector
    get() {
        if (_DistributeHorizontalCenter != null) {
            return _DistributeHorizontalCenter!!
        }
        _DistributeHorizontalCenter = ImageVector.Builder(
            name = "DistributeHorizontalCenter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 2f)
                verticalLineTo(5f)
                horizontalLineTo(10f)
                verticalLineTo(19f)
                horizontalLineTo(8f)
                verticalLineTo(22f)
                horizontalLineTo(6f)
                verticalLineTo(19f)
                horizontalLineTo(4f)
                verticalLineTo(5f)
                horizontalLineTo(6f)
                verticalLineTo(2f)
                horizontalLineTo(8f)
                moveTo(16f, 2f)
                verticalLineTo(7f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                horizontalLineTo(16f)
                verticalLineTo(22f)
                horizontalLineTo(18f)
                verticalLineTo(17f)
                horizontalLineTo(20f)
                verticalLineTo(7f)
                horizontalLineTo(18f)
                verticalLineTo(2f)
                horizontalLineTo(16f)
                close()
            }
        }.build()

        return _DistributeHorizontalCenter!!
    }

@Suppress("ObjectPropertyName")
private var _DistributeHorizontalCenter: ImageVector? = null
