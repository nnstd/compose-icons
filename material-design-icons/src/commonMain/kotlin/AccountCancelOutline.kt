package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountCancelOutline: ImageVector
    get() {
        if (_AccountCancelOutline != null) {
            return _AccountCancelOutline!!
        }
        _AccountCancelOutline = ImageVector.Builder(
            name = "AccountCancelOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 4f)
                moveTo(10f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 6f)
                moveTo(10f, 13f)
                curveTo(7.33f, 13f, 2f, 14.33f, 2f, 17f)
                verticalLineTo(20f)
                horizontalLineTo(11.5f)
                arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.03f, 18.1f)
                horizontalLineTo(3.9f)
                verticalLineTo(17f)
                curveTo(3.9f, 16.36f, 7.03f, 14.9f, 10f, 14.9f)
                curveTo(10.5f, 14.9f, 11f, 14.95f, 11.5f, 15.03f)
                arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.55f, 13.29f)
                curveTo(11.61f, 13.1f, 10.71f, 13f, 10f, 13f)
                moveTo(17.5f, 13f)
                curveTo(15f, 13f, 13f, 15f, 13f, 17.5f)
                curveTo(13f, 20f, 15f, 22f, 17.5f, 22f)
                curveTo(20f, 22f, 22f, 20f, 22f, 17.5f)
                curveTo(22f, 15f, 20f, 13f, 17.5f, 13f)
                moveTo(17.5f, 14.5f)
                curveTo(19.16f, 14.5f, 20.5f, 15.84f, 20.5f, 17.5f)
                curveTo(20.5f, 18.06f, 20.35f, 18.58f, 20.08f, 19f)
                lineTo(16f, 14.92f)
                curveTo(16.42f, 14.65f, 16.94f, 14.5f, 17.5f, 14.5f)
                moveTo(14.92f, 16f)
                lineTo(19f, 20.08f)
                curveTo(18.58f, 20.35f, 18.06f, 20.5f, 17.5f, 20.5f)
                curveTo(15.84f, 20.5f, 14.5f, 19.16f, 14.5f, 17.5f)
                curveTo(14.5f, 16.94f, 14.65f, 16.42f, 14.92f, 16f)
                close()
            }
        }.build()

        return _AccountCancelOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AccountCancelOutline: ImageVector? = null
