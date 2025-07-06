package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountCogOutline: ImageVector
    get() {
        if (_AccountCogOutline != null) {
            return _AccountCogOutline!!
        }
        _AccountCogOutline = ImageVector.Builder(
            name = "AccountCogOutline",
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
                moveTo(17f, 12f)
                curveTo(16.84f, 12f, 16.76f, 12.08f, 16.76f, 12.24f)
                lineTo(16.5f, 13.5f)
                curveTo(16.28f, 13.68f, 15.96f, 13.84f, 15.72f, 14f)
                lineTo(14.44f, 13.5f)
                curveTo(14.36f, 13.5f, 14.2f, 13.5f, 14.12f, 13.6f)
                lineTo(13.16f, 15.36f)
                curveTo(13.08f, 15.44f, 13.08f, 15.6f, 13.24f, 15.68f)
                lineTo(14.28f, 16.5f)
                verticalLineTo(17.5f)
                lineTo(13.24f, 18.32f)
                curveTo(13.16f, 18.4f, 13.08f, 18.56f, 13.16f, 18.64f)
                lineTo(14.12f, 20.4f)
                curveTo(14.2f, 20.5f, 14.36f, 20.5f, 14.44f, 20.5f)
                lineTo(15.72f, 20f)
                curveTo(15.96f, 20.16f, 16.28f, 20.32f, 16.5f, 20.5f)
                lineTo(16.76f, 21.76f)
                curveTo(16.76f, 21.92f, 16.84f, 22f, 17f, 22f)
                horizontalLineTo(19f)
                curveTo(19.08f, 22f, 19.24f, 21.92f, 19.24f, 21.76f)
                lineTo(19.4f, 20.5f)
                curveTo(19.72f, 20.32f, 20.04f, 20.16f, 20.28f, 20f)
                lineTo(21.5f, 20.5f)
                curveTo(21.64f, 20.5f, 21.8f, 20.5f, 21.8f, 20.4f)
                lineTo(22.84f, 18.64f)
                curveTo(22.92f, 18.56f, 22.84f, 18.4f, 22.76f, 18.32f)
                lineTo(21.72f, 17.5f)
                verticalLineTo(16.5f)
                lineTo(22.76f, 15.68f)
                curveTo(22.84f, 15.6f, 22.92f, 15.44f, 22.84f, 15.36f)
                lineTo(21.8f, 13.6f)
                curveTo(21.8f, 13.5f, 21.64f, 13.5f, 21.5f, 13.5f)
                lineTo(20.28f, 14f)
                curveTo(20.04f, 13.84f, 19.72f, 13.68f, 19.4f, 13.5f)
                lineTo(19.24f, 12.24f)
                curveTo(19.24f, 12.08f, 19.08f, 12f, 19f, 12f)
                horizontalLineTo(17f)
                moveTo(10f, 13f)
                curveTo(7.33f, 13f, 2f, 14.33f, 2f, 17f)
                verticalLineTo(20f)
                horizontalLineTo(11.67f)
                curveTo(11.39f, 19.41f, 11.19f, 18.77f, 11.09f, 18.1f)
                horizontalLineTo(3.9f)
                verticalLineTo(17f)
                curveTo(3.9f, 16.36f, 7.03f, 14.9f, 10f, 14.9f)
                curveTo(10.43f, 14.9f, 10.87f, 14.94f, 11.3f, 15f)
                curveTo(11.5f, 14.36f, 11.77f, 13.76f, 12.12f, 13.21f)
                curveTo(11.34f, 13.08f, 10.6f, 13f, 10f, 13f)
                moveTo(18.04f, 15.5f)
                curveTo(18.84f, 15.5f, 19.5f, 16.16f, 19.5f, 17.04f)
                curveTo(19.5f, 17.84f, 18.84f, 18.5f, 18.04f, 18.5f)
                curveTo(17.16f, 18.5f, 16.5f, 17.84f, 16.5f, 17.04f)
                curveTo(16.5f, 16.16f, 17.16f, 15.5f, 18.04f, 15.5f)
                close()
            }
        }.build()

        return _AccountCogOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AccountCogOutline: ImageVector? = null
