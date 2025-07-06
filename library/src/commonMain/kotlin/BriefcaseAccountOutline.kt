package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BriefcaseAccountOutline: ImageVector
    get() {
        if (_BriefcaseAccountOutline != null) {
            return _BriefcaseAccountOutline!!
        }
        _BriefcaseAccountOutline = ImageVector.Builder(
            name = "BriefcaseAccountOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 6f)
                curveTo(20.58f, 6f, 21.05f, 6.2f, 21.42f, 6.59f)
                curveTo(21.8f, 7f, 22f, 7.45f, 22f, 8f)
                verticalLineTo(19f)
                curveTo(22f, 19.55f, 21.8f, 20f, 21.42f, 20.41f)
                curveTo(21.05f, 20.8f, 20.58f, 21f, 20f, 21f)
                horizontalLineTo(4f)
                curveTo(3.42f, 21f, 2.95f, 20.8f, 2.58f, 20.41f)
                curveTo(2.2f, 20f, 2f, 19.55f, 2f, 19f)
                verticalLineTo(8f)
                curveTo(2f, 7.45f, 2.2f, 7f, 2.58f, 6.59f)
                curveTo(2.95f, 6.2f, 3.42f, 6f, 4f, 6f)
                horizontalLineTo(8f)
                verticalLineTo(4f)
                curveTo(8f, 3.42f, 8.2f, 2.95f, 8.58f, 2.58f)
                curveTo(8.95f, 2.2f, 9.42f, 2f, 10f, 2f)
                horizontalLineTo(14f)
                curveTo(14.58f, 2f, 15.05f, 2.2f, 15.42f, 2.58f)
                curveTo(15.8f, 2.95f, 16f, 3.42f, 16f, 4f)
                verticalLineTo(6f)
                horizontalLineTo(20f)
                moveTo(4f, 8f)
                verticalLineTo(19f)
                horizontalLineTo(20f)
                verticalLineTo(8f)
                horizontalLineTo(4f)
                moveTo(14f, 6f)
                verticalLineTo(4f)
                horizontalLineTo(10f)
                verticalLineTo(6f)
                horizontalLineTo(14f)
                moveTo(12f, 9f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.25f, 11.25f)
                curveTo(14.25f, 12.5f, 13.24f, 13.5f, 12f, 13.5f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.75f, 11.25f)
                curveTo(9.75f, 10f, 10.76f, 9f, 12f, 9f)
                moveTo(16.5f, 18f)
                horizontalLineTo(7.5f)
                verticalLineTo(16.88f)
                curveTo(7.5f, 15.63f, 9.5f, 14.63f, 12f, 14.63f)
                curveTo(14.5f, 14.63f, 16.5f, 15.63f, 16.5f, 16.88f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _BriefcaseAccountOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BriefcaseAccountOutline: ImageVector? = null
