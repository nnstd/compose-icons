package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BriefcaseAccount: ImageVector
    get() {
        if (_BriefcaseAccount != null) {
            return _BriefcaseAccount!!
        }
        _BriefcaseAccount = ImageVector.Builder(
            name = "BriefcaseAccount",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 6f)
                horizontalLineTo(16f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 2f)
                horizontalLineTo(10f)
                curveTo(8.89f, 2f, 8f, 2.89f, 8f, 4f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                curveTo(2.89f, 6f, 2f, 6.89f, 2f, 8f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 21f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 19f)
                verticalLineTo(8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 6f)
                moveTo(10f, 4f)
                horizontalLineTo(14f)
                verticalLineTo(6f)
                horizontalLineTo(10f)
                verticalLineTo(4f)
                moveTo(12f, 9f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.5f, 11.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 14f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 11.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 9f)
                moveTo(17f, 19f)
                horizontalLineTo(7f)
                verticalLineTo(17.75f)
                curveTo(7f, 16.37f, 9.24f, 15.25f, 12f, 15.25f)
                curveTo(14.76f, 15.25f, 17f, 16.37f, 17f, 17.75f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _BriefcaseAccount!!
    }

@Suppress("ObjectPropertyName")
private var _BriefcaseAccount: ImageVector? = null
