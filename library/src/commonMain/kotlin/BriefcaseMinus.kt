package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BriefcaseMinus: ImageVector
    get() {
        if (_BriefcaseMinus != null) {
            return _BriefcaseMinus!!
        }
        _BriefcaseMinus = ImageVector.Builder(
            name = "BriefcaseMinus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                horizontalLineTo(22f)
                moveTo(10f, 2f)
                horizontalLineTo(14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 4f)
                verticalLineTo(6f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 8f)
                verticalLineTo(13.53f)
                curveTo(20.94f, 12.58f, 19.54f, 12f, 18f, 12f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 18f)
                curveTo(12f, 19.09f, 12.29f, 20.12f, 12.8f, 21f)
                horizontalLineTo(4f)
                curveTo(2.89f, 21f, 2f, 20.1f, 2f, 19f)
                verticalLineTo(8f)
                curveTo(2f, 6.89f, 2.89f, 6f, 4f, 6f)
                horizontalLineTo(8f)
                verticalLineTo(4f)
                curveTo(8f, 2.89f, 8.89f, 2f, 10f, 2f)
                moveTo(14f, 6f)
                verticalLineTo(4f)
                horizontalLineTo(10f)
                verticalLineTo(6f)
                horizontalLineTo(14f)
                close()
            }
        }.build()

        return _BriefcaseMinus!!
    }

@Suppress("ObjectPropertyName")
private var _BriefcaseMinus: ImageVector? = null
