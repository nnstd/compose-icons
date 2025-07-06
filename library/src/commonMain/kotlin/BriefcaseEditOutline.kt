package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BriefcaseEditOutline: ImageVector
    get() {
        if (_BriefcaseEditOutline != null) {
            return _BriefcaseEditOutline!!
        }
        _BriefcaseEditOutline = ImageVector.Builder(
            name = "BriefcaseEditOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.04f, 12.13f)
                curveTo(21.18f, 12.13f, 21.31f, 12.19f, 21.42f, 12.3f)
                lineTo(22.7f, 13.58f)
                curveTo(22.92f, 13.79f, 22.92f, 14.14f, 22.7f, 14.35f)
                lineTo(21.7f, 15.35f)
                lineTo(19.65f, 13.3f)
                lineTo(20.65f, 12.3f)
                curveTo(20.76f, 12.19f, 20.9f, 12.13f, 21.04f, 12.13f)
                moveTo(19.07f, 13.88f)
                lineTo(21.12f, 15.93f)
                lineTo(15.06f, 22f)
                horizontalLineTo(13f)
                verticalLineTo(19.94f)
                lineTo(19.07f, 13.88f)
                moveTo(10f, 2f)
                horizontalLineTo(14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 4f)
                verticalLineTo(6f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 8f)
                lineTo(20f, 10f)
                verticalLineTo(8f)
                horizontalLineTo(4f)
                verticalLineTo(19f)
                horizontalLineTo(11f)
                verticalLineTo(21f)
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
                close()
            }
        }.build()

        return _BriefcaseEditOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BriefcaseEditOutline: ImageVector? = null
