package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BriefcaseSearch: ImageVector
    get() {
        if (_BriefcaseSearch != null) {
            return _BriefcaseSearch!!
        }
        _BriefcaseSearch = ImageVector.Builder(
            name = "BriefcaseSearch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.5f, 12f)
                curveTo(19f, 12f, 21f, 14f, 21f, 16.5f)
                curveTo(21f, 17.38f, 20.75f, 18.21f, 20.31f, 18.9f)
                lineTo(23.39f, 22f)
                lineTo(22f, 23.39f)
                lineTo(18.88f, 20.32f)
                curveTo(18.19f, 20.75f, 17.37f, 21f, 16.5f, 21f)
                curveTo(14f, 21f, 12f, 19f, 12f, 16.5f)
                curveTo(12f, 14f, 14f, 12f, 16.5f, 12f)
                moveTo(16.5f, 14f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 16.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 19f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 16.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 14f)
                moveTo(10f, 2f)
                horizontalLineTo(14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 4f)
                verticalLineTo(6f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 8f)
                verticalLineTo(13.03f)
                curveTo(20.85f, 11.21f, 18.82f, 10f, 16.5f, 10f)
                arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 16.5f)
                curveTo(10f, 18.25f, 10.69f, 19.83f, 11.81f, 21f)
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

        return _BriefcaseSearch!!
    }

@Suppress("ObjectPropertyName")
private var _BriefcaseSearch: ImageVector? = null
