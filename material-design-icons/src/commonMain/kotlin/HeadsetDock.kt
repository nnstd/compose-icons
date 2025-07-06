package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HeadsetDock: ImageVector
    get() {
        if (_HeadsetDock != null) {
            return _HeadsetDock!!
        }
        _HeadsetDock = ImageVector.Builder(
            name = "HeadsetDock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 18f)
                horizontalLineTo(9f)
                verticalLineTo(6.13f)
                curveTo(7.27f, 6.57f, 6f, 8.14f, 6f, 10f)
                verticalLineTo(11f)
                horizontalLineTo(8f)
                verticalLineTo(17f)
                horizontalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 15f)
                verticalLineTo(10f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 4f)
                horizontalLineTo(11f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 10f)
                verticalLineTo(12f)
                horizontalLineTo(18f)
                verticalLineTo(9f)
                horizontalLineTo(20f)
                verticalLineTo(12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 14f)
                horizontalLineTo(17f)
                verticalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 17f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                horizontalLineTo(15f)
                verticalLineTo(10f)
                curveTo(15f, 8.14f, 13.73f, 6.57f, 12f, 6.13f)
                verticalLineTo(18f)
                horizontalLineTo(22f)
                verticalLineTo(20f)
                horizontalLineTo(2f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _HeadsetDock!!
    }

@Suppress("ObjectPropertyName")
private var _HeadsetDock: ImageVector? = null
