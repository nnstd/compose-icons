package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EmoticonCoolOutline: ImageVector
    get() {
        if (_EmoticonCoolOutline != null) {
            return _EmoticonCoolOutline!!
        }
        _EmoticonCoolOutline = ImageVector.Builder(
            name = "EmoticonCoolOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 10f)
                curveTo(19f, 11.38f, 16.88f, 12.5f, 15.5f, 12.5f)
                curveTo(14.12f, 12.5f, 12.75f, 11.38f, 12.75f, 10f)
                horizontalLineTo(11.25f)
                curveTo(11.25f, 11.38f, 9.88f, 12.5f, 8.5f, 12.5f)
                curveTo(7.12f, 12.5f, 5f, 11.38f, 5f, 10f)
                horizontalLineTo(4.25f)
                curveTo(4.09f, 10.64f, 4f, 11.31f, 4f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 20f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 12f)
                curveTo(20f, 11.31f, 19.91f, 10.64f, 19.75f, 10f)
                horizontalLineTo(19f)
                moveTo(12f, 4f)
                curveTo(9.04f, 4f, 6.45f, 5.61f, 5.07f, 8f)
                horizontalLineTo(18.93f)
                curveTo(17.55f, 5.61f, 14.96f, 4f, 12f, 4f)
                moveTo(22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                moveTo(12f, 17.23f)
                curveTo(10.25f, 17.23f, 8.71f, 16.5f, 7.81f, 15.42f)
                lineTo(9.23f, 14f)
                curveTo(9.68f, 14.72f, 10.75f, 15.23f, 12f, 15.23f)
                curveTo(13.25f, 15.23f, 14.32f, 14.72f, 14.77f, 14f)
                lineTo(16.19f, 15.42f)
                curveTo(15.29f, 16.5f, 13.75f, 17.23f, 12f, 17.23f)
                close()
            }
        }.build()

        return _EmoticonCoolOutline!!
    }

@Suppress("ObjectPropertyName")
private var _EmoticonCoolOutline: ImageVector? = null
