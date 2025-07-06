package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BriefcaseMinusOutline: ImageVector
    get() {
        if (_BriefcaseMinusOutline != null) {
            return _BriefcaseMinusOutline!!
        }
        _BriefcaseMinusOutline = ImageVector.Builder(
            name = "BriefcaseMinusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 2f)
                horizontalLineTo(14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 4f)
                verticalLineTo(6f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 8f)
                verticalLineTo(13.53f)
                curveTo(21.42f, 13f, 20.75f, 12.6f, 20f, 12.34f)
                verticalLineTo(8f)
                horizontalLineTo(4f)
                verticalLineTo(19f)
                horizontalLineTo(12.08f)
                curveTo(12.2f, 19.72f, 12.45f, 20.39f, 12.8f, 21f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 19f)
                verticalLineTo(8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 6f)
                horizontalLineTo(8f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 2f)
                moveTo(14f, 6f)
                verticalLineTo(4f)
                horizontalLineTo(10f)
                verticalLineTo(6f)
                horizontalLineTo(14f)
                moveTo(14f, 17f)
                horizontalLineTo(22f)
                verticalLineTo(19f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _BriefcaseMinusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BriefcaseMinusOutline: ImageVector? = null
